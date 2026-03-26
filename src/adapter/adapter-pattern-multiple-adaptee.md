## 🎯 Adapter Pattern (Many → One Example)

### You have multiple existing classes (**adaptees**)
But your client expects **one unified interface**

👉 The adapter:
- combines multiple classes
- translates them into one interface

---

## 📌 Example: Media Player Adapter

### 🔹 Target Interface (what client wants)

```java
interface MediaPlayer {
    void play(String audioType, String fileName);
}
```

---

### 🔹 Multiple Adaptees (existing classes)

```java
class Mp4Player {
    void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}

class VlcPlayer {
    void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}
```

---

### 🔹 Adapter (converts interface)

👉 Introduce a `MediaAdapter` to bridge incompatible interfaces

```java
class MediaAdapter implements MediaPlayer {

    private Mp4Player mp4Player;
    private VlcPlayer vlcPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        }
    }
}
```

---

### 🔹 Client

```java
class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }
}
```

---

### 🔹 Usage

```java
public class Test {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "song.mp3");
        player.play("mp4", "video.mp4");
        player.play("vlc", "movie.vlc");
    }
}
```

---

## 🧠 Key Insights

- Adapter converts **incompatible interfaces → compatible interface**
- Not limited to **1-to-1 mapping**
- Can also be **many-to-one mapping** (multiple adaptees → one interface)

---

## ⚠️ Design Limitation (Important)

This version uses:

```java
if (audioType.equalsIgnoreCase(...))
```

👉 This causes:
- ❌ Violates **Open/Closed Principle (OCP)**
- ❌ Hard to extend (new formats require modifying adapter)

👉 Cleaner approach:
- One adapter per class (e.g., `VlcAdapter`, `Mp4Adapter`)
- Removes conditional logic

---

## 🔍 Adapter vs Facade (Important Distinction)

This example may look like Facade, but:

- **Adapter → converts interface**
- **Facade → simplifies usage**

👉 Here we are:
> Translating `playVlc()` / `playMp4()` → `play()`

✔ So this is **Adapter Pattern**

---

## 🧠 One-line Summary

> Adapter wraps existing classes and exposes a new interface that the client expects.
