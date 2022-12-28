package model;

import java.util.ArrayList;

public class EventOrganizer {

    private int Custid;
    private String Custname;
    private String Custaddr;
    private String Custemail;
    private String Custphone;

    public int getCustid() {
        return Custid;
    }

    public void setCustid(int custid) {
        Custid = custid;
    }

    public String getCustname() {
        return Custname;
    }

    public void setCustname(String custname) {
        Custname = custname;
    }

    public String getCustaddr() {
        return Custaddr;
    }

    public void setCustaddr(String custaddr) {
        Custaddr = custaddr;
    }

    public String getCustemail() {
        return Custemail;
    }

    public void setCustemail(String custemail) {
        Custemail = custemail;
    }


    public String getCustphone() {
        return Custphone;
    }

    public void setCustphone(String custphone) {
        Custphone = custphone;
    }

    public  void input_data_tamu(){
        System.out.println(this.getCustid());
        System.out.println(this.getCustname());
        System.out.println(this.getCustaddr());
        System.out.println(this.getCustemail());
        System.out.println(this.getCustphone());
    }

    public EventOrganizer(){

    }

    public EventOrganizer(int id, String name,String addr, String email, String no_phone ){
        this.Custid = id;
        this.Custname = name;
        this.Custaddr = addr;
        this.Custemail = email;
        this.Custphone = no_phone;
    }
    public static void PrintGuests(ArrayList<EventOrganizer>daftar_tamu){
        System.out.println("\n =========== Data Guest ===========");
        for (EventOrganizer tamu : daftar_tamu){
            System.out.println("Id\t:"+tamu.getCustid());
            System.out.println("name\t:"+tamu.getCustname());
            System.out.println("addr\t:"+tamu.getCustaddr());
            System.out.println("Email\t:"+tamu.getCustemail());
            System.out.println("no_phone\t:"+tamu.getCustphone()+"\n");
        }
    }


}
