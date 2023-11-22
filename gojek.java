package submain;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Gojek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("Rp#,###.00",symbols);
        
        System.out.printf("============|Selamat datang di GOJOL tarif kalkulator|============\n");
        System.out.printf("Pilih jenis Kendaraan (motor / mobil) \t\t\t: ");
        String kendaraan = in.next();

        System.out.printf("Masukkan Jarak Perjalanan (Km) \t\t\t\t: ");
        float jarak = in.nextInt();


        System.out.printf("Pilih opsi pembayaran (GOPAY / OVO / Cash) \t\t: ");
        String pembayaran = in.next();

        System.out.printf("");

        System.out.printf("==================================================================\n");

        if (jarak<=2){
            if (kendaraan.equalsIgnoreCase("motor")){
                int harga = 15000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }

            } else if (kendaraan.equalsIgnoreCase("mobil")){
                int harga = 25000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
            }
        }

        else if (2<jarak && jarak<=5){
            if (kendaraan.equalsIgnoreCase("motor")){
                int harga = 20000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }

            } else if (kendaraan.equalsIgnoreCase("mobil")){
                int harga = 40000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " +df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
            }
        }

        else if (5<jarak && jarak<=10){
            if (kendaraan.equalsIgnoreCase("motor")){
                int harga = 30000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }

            } else if (kendaraan.equalsIgnoreCase("mobil")){
                int harga = 65000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
            }
        }

        else {
            if (kendaraan.equalsIgnoreCase("motor")){
                int harga = (int)jarak*8000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                

            } else if (kendaraan.equalsIgnoreCase("mobil")){
                int harga = (int)jarak*15000;
                if(pembayaran.equalsIgnoreCase("gopay")){
                    int total = harga*90/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if (pembayaran.equalsIgnoreCase("ovo")){
                    int total = harga*95/100;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
                else if(pembayaran.equalsIgnoreCase("cash")){
                    int total = harga;
                    System.out.printf("Total pembayaran : " + df.format(total));
                }
            }
        }
    System.out.printf("\n==================================================================\n");
    }
}
