# Merge Conflict Шийдвэрлэлт

## Дэлгэрэнгүй

Лабораторийн ажлын хүрээнд Multiplication классын Javadoc коммент дээр merge conflict гарсан. Хоёр өөр feature салбар ижил мөрийг өөр өөрөөр засварласан.

## Conflict Гарсан Нөхцөл

**Салбарууд:**
- `feature/update-multiplication-docs` - "Математик үржүүлэх үйлдэл хийдэг класс" гэж засварласан
- `feature/improve-multiplication-comments` - "Тооны үржүүлэх функц" гэж засварласан

Хоёр салбар `src/main/java/labxx/sict/must/edu/mn/Multiplication.java` файлын Javadoc коммент дээр ажилласан учир Git хоёр өөрчлөлтийг хэрхэн нэгтгэхээ мэдэхгүй болсон.

## Conflict-ийн Код
```
<<<<<<< HEAD
/**
 * Тооны үржүүлэх функц
 * Үржвэр тооцоолно
 */
=======
/**
 * Математик үржүүлэх үйлдэл хийдэг класс
 * Хоёр тоог үржүүлнэ
 */
>>>>>>> develop
```

## Шийдвэрлэлтийн Алхамууд

### 1. Conflict илрүүлэх
```bash
git checkout feature/improve-multiplication-comments
git merge develop
```

Git дараах мэдэгдлийг өгсөн:
```
Auto-merging src/main/java/labxx/sict/must/edu/mn/Multiplication.java
CONFLICT (content): Merge conflict in src/main/java/labxx/sict/must/edu/mn/Multiplication.java
Automatic merge failed; fix conflicts and then commit the result.
```

### 2. Conflict байгаа файлуудыг харах
```bash
git status
```

Үр дүн:
```
Unmerged paths:
  both modified:   src/main/java/labxx/sict/must/edu/mn/Multiplication.java
```

### 3. Файл засварлах

VS Code дээр Multiplication.java файлыг нээж conflict marker-уудыг (`<<<<<<<`, `=======`, `>>>>>>>`) устгасан.

**Хоёр коммент-ыг нэгтгэсэн шийдэл:**
```java
/**
 * Математик үржүүлэх үйлдэл хийдэг класс
 * Хоёр тоог үржүүлж үржвэр тооцоолно
 */
public class Multiplication {
    // ...
}
```

### 4. Шийдсэн өөрчлөлтийг commit хийх
```bash
# Засварласан файлыг staging area-д нэмэх
git add src/main/java/labxx/sict/must/edu/mn/Multiplication.java

# Merge commit хийх
git commit -m "Resolve merge conflict in Multiplication Javadoc comments"

# GitHub руу push хийх
git push origin feature/improve-multiplication-comments
```

### 5. Pull Request үүсгэх

GitHub дээр PR үүсгэж develop руу merge хийсэн. CI шалгалт амжилттай гарч conflict шийдэгдсэн кодыг нэгтгэсэн.

## Хэрэглэсэн Git Командууд
```bash
# Conflict үүсгэх
git merge develop

# Төлөв харах
git status

# Conflict илрүүлэх
git diff

# Шийдсэн файлыг нэмэх
git add <>

# Merge дуусгах
git commit -m "Resolve merge conflict"

# Push хийх
git push
```

## Сургамж ба Зөвлөмж

1. **Байнга sync хийх**: Feature салбар дээр удаан ажиллахаас өмнө develop-тай тогтмол `git pull` хийж шинэчлэгдсэн байх
2. **Жижиг commit хий**: Том өөрчлөлтийг олон жижиг commit-д хувааж conflict-ыг багасгах
3. **Багаараа ажиллах**: Ижил файл дээр хамтран ажиллахдаа хэн юу хийж байгааг мэдэж байх
4. **Тодорхой commit message**: "Update file" биш "Update Multiplication Javadoc to clarify purpose" гэх мэт
5. **VS Code ашиглах**: Conflict marker-уудыг харахад илүү хялбар

## Дүгнэлт

Merge conflict нь Git-ийн чухал хэсэг бөгөөд багаар ажиллахад тохиолддог асуудал. Тиймээс зөв арга замаар шийдвэрлэвэл ямар ч асуудалгүй юм.