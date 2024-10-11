import java.util.Scanner;

public class Tesst {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Pilih Jenis Kendaraaan");
        System.out.println("1. Sepeda");
        System.out.println("2. Mobil");
        System.out.println("---------Isi Pilihan Kendaraan--------");
        int jenis = n.nextInt();
        System.out.println("--------------------------------------");
        

        if (jenis == 1) {
            Bicycle sepeda = new Bicycle();
            System.out.print("Jumlah Roda  : ");
            sepeda.numWheels = n.nextInt();
            System.out.print("Harga        : ");
            sepeda.price = n.nextDouble();
            System.out.print("Tipe Sepeda  : ");
            sepeda.bikeType = n.next();
            System.out.print("Diskon Atau Tidak? (1. Ya /2. Tidak)");
            int diskonya = n.nextInt();
            if (diskonya == 1) {
                System.out.print("Masukkan Diskon (%) : ");
                    double sepedaDiscount = n.nextDouble();
                    sepedaDiscount = sepeda.price - (sepeda.price * sepedaDiscount / 100);
                    System.out.println("Harga setelah diskon: " + sepedaDiscount);
               // System.out.print("Masukkan Diskon (%) : ");
               // sepeda.price = n.nextInt();
                System.out.println("--------------------------");
                System.out.println("      INI DATA SEPEDA ");
                System.out.println("--------------------------");
                sepeda.print();
                System.out.println("Harga setelah diskon: " + sepedaDiscount);
            } else if (diskonya == 2) {
                System.out.println("--------------------------");
                System.out.println("      INI DATA SEPEDA ");
                System.out.println("--------------------------");
                sepeda.print();

            }

        } else if (jenis == 2) {
            System.out.print("Convertible (1. Ya /2. Tidak) :");
            int conv = n.nextInt();
            n.nextLine();
            if (conv == 1) {
                Convertible mobil = new Convertible();
                System.out.print("Jumlah Roda  : ");
                mobil.numWheels = n.nextInt();
                System.out.print("Harga        : ");
                mobil.price = n.nextDouble();
                System.out.print("Jumlah Pintu : ");
                mobil.numDoors = n.nextInt();
                System.out.print("Apakah Elektrik? (true/false) : ");
                mobil.isElectric = n.nextBoolean();
                System.out.print("Roof type (hard/soft): ");
                String roofType = n.nextLine();
                n.nextLine();
                System.out.print("Diskon Atau Tidak? (1. Ya/2. Tidak) : ");
                int diskonya = n.nextInt();
                if (diskonya == 1) {
                    System.out.print("Masukkan Diskon (%) : ");
                    double carDiscount = n.nextDouble();
                    carDiscount = mobil.price - (mobil.price * carDiscount / 100);
                    System.out.println("Harga setelah diskon: " + carDiscount);
                    System.out.println("--------------------------");
                    System.out.println("      INI DATA MOBIL ");
                    System.out.println("--------------------------");
                    mobil.print();
                    System.out.println("Harga setelah diskon: " + carDiscount);
                } else if (diskonya == 2) {
                    System.out.println("--------------------------");
                    System.out.println("      INI DATA MOBIL ");
                    System.out.println("--------------------------");
                    mobil.print();
                
                    
                    
                }
                

            } else if (conv == 2) {
                Car mobil = new Car();
                System.out.print("Jumlah Roda  : ");
                mobil.numWheels = n.nextInt();
                System.out.print("Harga        : ");
                mobil.price = n.nextDouble();
                System.out.print("Jumlah Pintu : ");
                mobil.numDoors = n.nextInt();
                System.out.print("Apakah Elektrik? (true/false) : ");
                mobil.isElectric = n.nextBoolean();
                System.out.print("Diskon Atau Tidak? (1/2) : ");
                int diskonya = n.nextInt();
                if (diskonya == 1) {
                    System.out.print("Masukkan Diskon (%) : ");
                    //mobil.discount = n.nextInt();
                    double carDiscount = n.nextDouble();
                    carDiscount = mobil.price - (mobil.price * carDiscount / 100);
                    System.out.println("Harga setelah diskon: " + carDiscount);
                    System.out.println("--------------------------");
                    System.out.println("      INI DATA MOBIL ");
                    System.out.println("--------------------------");
                    mobil.print();
                    
                    System.out.println("Harga setelah diskon: " + carDiscount);
                } else if (diskonya == 2) {
                    System.out.println("--------------------------");
                    System.out.println("      INI DATA MOBIL ");
                    System.out.println("--------------------------");
            
                    mobil.print();

                }
            }

        }

        n.close();
    }
}