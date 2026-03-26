## 🎯 Adapter Pattern (One Adapter Per Class - Cleaner Design)

### Problem
You have multiple existing classes (**adaptees**) with different interfaces,  
but your client expects a **common interface**.

👉 Instead of one adapter with `if-else`,  
we create **one adapter per adaptee**.

---

## 📌 Example: Media Player (Clean Version)

### 🔹 Target Interface

```java
interface MediaPlayer {
    void play(String fileName);
}
```

---

### 🔹 Adaptees

```java
class VlcPlayer {
    void playVLC(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

class Mp4Player {
    void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
```

---

### 🔹 Adapters (One per class)

```java
class VlcAdapter implements MediaPlayer {

    private VlcPlayer vlc;

    public VlcAdapter(VlcPlayer vlc) {
        this.vlc = vlc;
    }

    @Override
    public void play(String fileName) {
        vlc.playVLC(fileName);
    }
}
```

```java
class Mp4Adapter implements MediaPlayer {

    private Mp4Player mp4;

    public Mp4Adapter(Mp4Player mp4) {
        this.mp4 = mp4;
    }

    @Override
    public void play(String fileName) {
        mp4.playMp4(fileName);
    }
}
```

---

### 🔹 Usage

```java
public class Test {
    public static void main(String[] args) {

        MediaPlayer vlcPlayer = new VlcAdapter(new VlcPlayer());
        vlcPlayer.play("movie.vlc");

        MediaPlayer mp4Player = new Mp4Adapter(new Mp4Player());
        mp4Player.play("video.mp4");
    }
}
```

---

## 🧠 Key Advantages

- ✅ No `if-else` → follows **Open/Closed Principle**
- ✅ Easy to extend (just add new adapter class)
- ✅ Type-safe (no string-based logic)
- ✅ Clean, modular design

---

## ⚠️ Trade-off

- Slightly more classes
- But **much better scalability and maintainability**

---

## 🔍 When to Use This Version

Use this when:
- You expect **new types to be added**
- You want **clean, extensible design**
- You want to follow **SOLID principles**

---

## 🧠 One-line Summary

> Prefer one adapter per adaptee for clean, extensible, and OCP-compliant design.
