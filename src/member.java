public class member {
    //initialize
 private String nama, team;
 private int umur, nilaiPenampilan, nilaiSuara, nilaiAttitude;
 
 //setter
 public void setNama(String name) {
   nama = name;
    }
 
 public void setTeam(String Team) {
   team = Team;
   }

 public void setUmur(int age) {
   umur = age;
   }
 
 public void setPenampilan(int performance) {
   nilaiPenampilan = performance;
   }
 
 public void setSuara(int voice) {
   nilaiSuara = voice;
   }
 
 public void setAttitude(int attitude) {
   nilaiAttitude = attitude;
   }
 
  //Getter
 String getNama() {
   return nama;
   }
 
 String getTeam() {
 return team;
 }

 int getUmur() {
 return umur;
 }
 
 int getPenampilan() {
 return nilaiPenampilan;
 }
 
 int getSuara() {
 return nilaiSuara;
 }
 
 int getAttitude() {
 return nilaiAttitude;
  }
    
 double getAverage(){
 double average = (nilaiAttitude + nilaiPenampilan + nilaiSuara)/3;
 return average;
    
}
}
