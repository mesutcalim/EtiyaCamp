# PostgreSql Veri Tipleri
PostgreSql veri tipleri aslında yazılım dillerindeki veri tiplerini karşılayacak şekilde hepsini içermektedir.
Bunun dışında bazı gereksinimler için üretilmiş extra tipler de mevcuttur.Bu tipleri anlatmaya benim bilgi birikimim
yetmeyeceği gibi zaten çok uzun ve detaylı bir yazı olacağı için kısaca ve en sık kullanılanları ele alacağım.
Kısaca en sık kullanılar türler şu şekildedir:
- Boolean tipleri 
- Character tipleri (char, varchar gibi)
- Sayısal Tipler(integer gibi)
- Geçici tipler(zaman, saat gibi)
- UUID (Evrensel Eşsiz Tanımlayıcılar(Universal Unique IDentifiers))
- Diziler (string dizileri,numaralar vb.)
- JSON
- hstore
- Diğerleri(Geometrik Veriler,Network Adresi gibi verileri tutan farklı farklı tipler)
---
## 1.Boolean Veri Tipi
Boolean veri tipi 3 değer tutabilir.
* Null
* True
* False
PostgreSQL içerisinde bir boolean sütun tanımlandığında PostgreSQL onu _true_ yada _false_ olarak dünüştürür.
`1,t,true,yes,y gibi değerleri true olarak`
`0,f,false,no,n gibi değerleri false olarak`
tutar.
---
## 2.Character Veri Tipleri
PostgreSQL 3 tip karakter türü barındırır.
+ Char(n)
+ Varchar(n)
+ Text

#### 1.Char(n)
+ Sütun uzunluğundan kısa değer girseniz dahi o uzunlukta alan tutur artan alanları boşluk olarak tutar.
+ Eğer sütun uzunluğundan daha uzun bir değer girerseniz PostgreSQL hata verir.

#### 2.Varchar(n)
+ Char tiplerinin aksine sütun uzunluğunu 50 karakter olarak ayarladığınızda 30 uzunluğa sahip bir değer girerseniz 
bellekte 30'luk yer tutar.
+ Eğer sütun için ayarlanmış 50 değerinden daha uzun bir değer girmeye çalışırsanız PostgreSQL hata verir.

#### 3.Text
+ Sınırsız uzunlukta karakter tutabilir.
+ Diğer iki tipin aksine uzunluk değeri belirtilmez.
---
## 3.Sayısal Veri Tipleri
PostgreSQL'de 2 çeşit sayısal veri tipi vardır.
+ Integer Veri Tipleri
+ Float-Noktasal Sayı Tipleri

####  1.Integerlar
3 çeşit integer sayı tipi vardır.

###### 1.smallint
2 byte'lık işaretli (eksi) sayılar da olmak üzere tutan sayısal veri tipidir.
###### 2.int
4 byte'lık işaretli (eksi) sayılar da olmak üzere tutan sayısal veri tipidir.
###### 3.serial
int veri tipi ile aynıdır.Ek olarak otomatik olarak artan tiptir.

#### 2.Floating-Noktalı Veri Tipleri

###### 1.float
8 Byte'lık kesirli sayıları tutabilen sayısal veri tipleridir. 
###### 2.real
4 Byte'lık kesirli sayıları tutabilen sayısal veri tipleridir.
###### 3.numeric 
Ondalıklı veri tiplerini virgülden önce ve sonra değerlerini belirtir şekilde tutar.
```
numeric(p,s) p=4 s=2 şeklinde bir column tanımlarsak.
örnek sayı = 1234,89 şeklindedir.
```
---
## 4.Geçici Veri Tipleri
PostgeSQL geçici 5 adet ana veri tipi barındırır.

+ Date => Sadece tarih verisi tutar.
+ Time => Günün zamanlarını(saat) tutar.
+ Tİmestamp => Tarih ve saat verisini tutar.
+ Timestamptz => Saat Dilimine duyarlı bir saat ve tarih bilgisi tutar.
+ Interval => Zaman periyodlarını tutar.
---
## 5.Diziler

PostgreSQL string,integer gibi veri tiplerini `array` veri tipi ile dizi halinde tutmamıza izin verir.
---
## 6.JSON 

PostgreSQL 2 tip JSON veri tipi barındırır.
+ JSON
+ JSONB
---
## 7.UUID

Serial veri tipine benzer özelliktedir. 
Açılımı Universal Unique Identifiers'dır.
Verilerin eşsiz ve sıralı olması için daha hassas bir veri tipidir.
---
## 8.Özel Veri Tipleri ve Diğerleri

PostgreSQL bazı özel veri tipleri de barındırır.
Yukarda sayılanların dışında çok daha fazla veri tipi barındırır.
Bazı özel veri tipleri:
+ box => bir dikdörtgen kutu 
+ line => bir nokta dizisi 
+ point => geometrik bir sayı çifti
+ lseg => bir çizgi parçası
+ polygon => kapalı bir geometrik
+ inet => bir IP4 adresi
+ macaddr => bir MAC adresi 
tutar.


