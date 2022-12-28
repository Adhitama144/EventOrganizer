import model.EventOrganizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuestRecord {
    static Scanner input_pilihan = new Scanner(System.in);
    static BufferedReader input_data_tamu = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        
        boolean ulang = true;
        char input_pilihan_menu;

        EventOrganizer[] daftar_tamu = new EventOrganizer[2];
        while (ulang) {
            System.out.println("\n====================================");
            System.out.println("\n========== Program Undang ==========");
            System.out.println("\n====================================");
            System.out.println("pilih menu");
            System.out.print("a.input data");
            System.out.print("b.cetak data ");
            System.out.print("c.exit");
            System.out.print("pilih :");
            input_pilihan_menu = input_pilihan.next().charAt(0);

            switch (input_pilihan_menu) {
                case 'a':
                    InpuTamuUndangan(daftar_tamu);
                    break;

                case 'b':
                    ArrayList<EventOrganizer> para_tamu = new ArrayList<EventOrganizer>(Arrays.asList(daftar_tamu));
                    EventOrganizer.PrintGuests(para_tamu);
                    break;

                case 'c':
                    ulang = false;
                    break;

                default:
                    System.out.println("\n mohon pilih huruf yang ada di menu\n");
                    break;
            }
        }
    }
    private static void
    InpuTamuUndangan(EventOrganizer[]daftar_tamu){
        System.out.println("\n=====================");
        for (int i =0;i<daftar_tamu.length; i++){
            try {
                EventOrganizer tamu = new EventOrganizer();
                System.out.print("Id\t:");
                tamu.setCustid(Integer.parseInt(input_data_tamu.readLine()));
                System.out.println("name\t:");
                tamu.setCustname(input_data_tamu.readLine());
                System.out.println("addr\t:");
                tamu.setCustaddr(input_data_tamu.readLine());
                System.out.println("Email\t:");
                tamu.setCustemail(input_data_tamu.readLine());
                System.out.println("no_phone\t:");
                tamu.setCustphone(input_data_tamu.readLine());

                daftar_tamu[i] = tamu;
                if (i != daftar_tamu.length) {
                    System.out.println("====================");
                }
            }catch (Exception e){
                System.out.println("eror:"+e.getMessage());
                }
            }
        }

    }
