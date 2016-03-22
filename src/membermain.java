import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author guest-lgmwvi
 */
public class membermain {
    public static void main(String[] args) {
        //initialize
        Scanner in = new Scanner (System.in);
        Scanner on = new Scanner (System.in);
        ArrayList<member> datamember = new ArrayList();
        
        String option;
        
        member member1 = new member();
        member member2 = new member();
        member member3 = new member();
        
        datamember.add(member1);
        datamember.add(member2);
        datamember.add(member3);
  //input
        for (int i = 0; i < datamember.size(); i++) {
        System.out.print("Input nama\t\t: ");
        datamember.get(i).setNama(on.nextLine());
        System.out.print("Input Team\t\t: ");
        datamember.get(i).setTeam(in.next());
        System.out.print("Input Umur\t\t: ");
        datamember.get(i).setUmur(in.nextInt());
        System.out.print("Input Performance\t: ");
        datamember.get(i).setPenampilan(in.nextInt());
        System.out.print("Input Voice\t\t: ");
        datamember.get(i).setSuara(in.nextInt());
        System.out.print("Input Attitude\t\t: ");
        datamember.get(i).setAtitude(in.nextInt());
        System.out.println();
 
   }
 //output
        for (int j = 0; j < datamember.size(); j++) {
            System.out.println("_____________MEMBER_____________");
            System.out.println("Nama\t\t: " + datamember.get(j).getNama());
            System.out.println("Team\t\t: " + datamember.get(j).getTeam());
            System.out.println("Umur\t\t: " + datamember.get(j).getUmur());
            System.out.println("Performance\t: " + datamember.get(j).getPenampilan());
            System.out.println("voice\t\t: " + datamember.get(j).getSuara());
            System.out.println("Attitude\t: " + datamember.get(j).getAttitude());
            System.out.println("Avg. Score\t:" + datamember.get(j).getAverage());
            System.out.println("--------------------------------");
            System.out.println();
        }
    }
    }
