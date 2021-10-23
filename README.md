Soru 1:

Şifre kontrol algoritması; yazacağınız kod ile aşağıdaki şartları kontrol eden bir metot yazmalısınız.

· En az bir nümerik karakter

· En az bir küçük harf

· En az bir büyük harf

· Boşluk olmayacak

· slash (/) bulunmayacak

· En az 6 karakter

· En çok 18 karakter

Hatalı bir şifre girilmesi durumunda: “Hatalı şifre, tekrar deneyin” mesajı verilmeli.

Doğru bir şifre girilmesi durumunda: “Geçerli şifre” mesajı verilmeli.

Giriş Formatı:

Password olarak nitelendirilen bir metinsel ifade.

Output Format:

· Hatalı bir şifre girilmesi durumunda: “Hatalı şifre, tekrar deneyin” mesajı verilmeli. (Tırnak işaretleri olmamalı)

· Doğru bir şifre girilmesi durumunda: “Geçerli şifre” mesajı verilmeli. (Tırnak işaretleri olmamalı)

Örnek girdi 1:

asdfP0

Örnek çıktı 1:

Geçerli şifre

Örnek girdi 2:

adksna4lsdkn

Örnek Çıktı 2:

Hatalı şifre, tekrar deneyin

***

Soru 2:

Bir kitapçıda, belirli bir sırada çeşitli fiyat ile sunulan bir kitap vardır. Sınırlı bir bütçeniz var ve bütçenize uyan en fazla sayıda ardışık kitabı almak istiyoruz. Kitapların fiyatları ve bütçeniz göz önüne alındığında, alınabilecek maksimum kitap sayısını hesaplayan kodu yazınız.

Örneğin :

· fiyatlar=[10,40,50,30,20,10,60]

· bütçe=60

60’dan daha az olan olası çözümler;

· 1) Tekli alımlar: [10] [40] [50] [30] [20] [10] [60]

· 2) İkili alımlar: [10,40] [30,20] [20,10] [10,10] [50,10] [40,20] [10,30]

· 3) Üçlü alımlar: [30,20,10] [40,10,10]

Bir seferde alınabilen maksimum kitap sayısı 3. seçenekle mümkün olmaktadır.

Metot açıklaması getMaxBooks metodunu yazmak için;

· getMaxBooks metodu şu parametreleri almaktadır

· int prices[n] : çeşitli kitap fiyatlarını içeren dizi, n: dizideki eleman sayısı

· int budget: kitap almak için kullanılabilecek toplam para

Dönüş değeri : Bir seferde alınabilecek olan maksimum kitap sayısı.

Kısıtlar:

· 1<=n<=10

· 1<=price[i]<=100

· 1<=budget<=10^3
