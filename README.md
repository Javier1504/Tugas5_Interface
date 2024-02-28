# oop-interface
Tugas #5 PBO latihan implementasi interface.

## Cara membuka project menggunakan Eclipse IDE

1. Clone repositori project ```oop-interface``` ke local direktori git Anda.
2. Buka Eclipse IDE, Pilih menu File > Import > Maven > Existing Maven Projects.
3. Pada Root Directory, klik tombol Browse, pilih direktori ```oop-interface```, kemudian check ```pom.xml```.
4. Tekan tombol finish untuk melakukan tombol impor.

## Deskripsi Soal
Kerjakan soal-soal berikut ini. (Soal diambil dari buku Java How to Program 10th edition 2015, halaman 439-440)

### Kerjakan soal berikut di package id.its.pbo.carbon
10.17 (CarbonFootprint Interface: Polymorphism) Using interfaces, as you learned in this chapter, you can specify similar behaviors for possibly disparate classes. Governments and companies worldwide are becoming increasingly concerned with carbon footprints (annual releases of carbon dioxide into the atmosphere) from buildings burning various types of fuels for heat, vehicles burning fuels for power, and the like. Many scientists blame these greenhouse gases for the phenomenon called global warming. Create three small classes unrelated by inheritance—classes ```Building```, ```Car``` and ```Bicycle```. Give each class some unique appropriate attributes and behaviors that it does not have in common with other classes. Write an interface ```CarbonFootprint``` with a ```getCarbonFootprint``` method. Have each of your classes implement that interface, so that its ```getCarbonFootprint``` method calculates an appropriate carbon footprint for that class (check out a few websites that explain how to calculate carbon footprints). Write an application that creates objects of each of the three classes, places references to those objects in ArrayList<CarbonFootprint>, then iterates through the ```ArrayList```, polymorphically invoking each object’s ```getCarbonFootprint``` method. For each object, print some identifying information and the object’s carbon footprint.