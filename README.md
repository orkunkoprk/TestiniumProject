# Projedeki İzlenen Süreç
**1)pom.xml dosyasındaki gerekli dependency'ler mavenrepository'den alındı ve cucumber framework'u için gerekli kütüphanelere erişildi.** <br/><br/>
**2)KitapYurdu.feature dosyası oluşturuldu ve senaryolar bu dosyaya yazıldı.** <br/><br/>
**3)KitapYurdu.feature dosyasındaki senaryo yazıldıktan sonra çalıştırıldı ve hazır stepsler KitapYurduSteps.java dosyasına aktarıldı.** <br/><br/>
**4)Projenin yapisinin olusturulmasi icin gerekli Driver dosyasi olusturuldu ve ChromeDriver tercih edildi, ayrica versiyon farkindan dolayi chromedriver.exe dosyasi github da paylasilmadi** <br/><br/>
**5)KitapYurduPage.java oluşturulmadan önce AbstractClass.java oluşturuldu ve click,sendkeys,assertion vb methodlar AbstractClass'tan KitapYurduPage.java ya getirildi** <br/><br/>
**6)KitapYurduPage.java dosyası senaryodaki istenilen adımlara göre yazildi.**<br/><br/>
**7)Proje çalıştırıldıktan sonra istenilen hedeflere ulaşıldı.**

## UYARI!
**ChromeDriver'dan kaynaklanabilecek version farklılıklarından dolayı projenin çalıştığını gösteren youtube video linki-->** [Youtube Video Linki](https://www.youtube.com/watch?v=QXCCV0c2dHw)  <br/><br/>
**AbstractClass.java daki Thread.sleet(2000); olmasının sebebi, test aşamalarını gözle daha kolay bir şekilde izleyebilmek.**
