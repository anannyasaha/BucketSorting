import java.util.*;
public class Buckets {
 private List<String> zeroBucket;
 private List<String> oneBucket;
 public Buckets() {
 zeroBucket = new ArrayList<>();
 oneBucket = new ArrayList<>();
 }
 public void addZero(String newValue) {
 zeroBucket.add(newValue);
 }
 public void addOne(String newValue) {
 oneBucket.add(newValue);
 }
 public List<String> getAllInOrder() {
 List<String> result = new ArrayList<>();
 for (String val: oneBucket) {
 result.add(val);
 }
 for (String val: zeroBucket) {
 result.add(val);
 }
 return result;
 }
 public void removeallfromZero(){ //removing the digits from zerobucket so that we can start fresh
   while(zeroBucket.size()>0){
    int i=0;
    zeroBucket.remove(i);

   }
 }
 public void removeallfromOne(){ //removing the digits from onebucket so that we can start fresh
   while(oneBucket.size()>0){
    int i=0;
    oneBucket.remove(i);
   }
 }
 public static void main(String[] args){
   String[] origNumbers = {"0011", "1001", "1000", "0111", "0101"};
List<String> numbers = new ArrayList<>();
for (String num: origNumbers) {
 numbers.add(num);
}
int numDigits = 4;
Buckets bucket=new Buckets();
List<String> newSequence=numbers;
System.out.println(numbers);
for(int j=3;j>=0;j--)
{
  if(j==3){ //When the sorting has just started we have to use numbers
  for(int i=0;i<numbers.size();i++){

    String bin=numbers.get(i);
      if(bin.charAt(j)=='0'){
        bucket.addZero(bin);
        }
      else{bucket.addOne(bin);}
    }
  }
  else{ //otherwise we have to use the newsquence because we have sorted according to last digit.
      for(int i=0;i<numbers.size();i++){

        String bin=newSequence.get(i);
          if(bin.charAt(j)=='0'){
            bucket.addZero(bin);
            }
          else{bucket.addOne(bin);}
        }
    }
    newSequence=bucket.getAllInOrder();
    System.out.println(newSequence); //it is printing arraylist, every time it sorts by digit.
    bucket.removeallfromOne();
    bucket.removeallfromZero();
  }

 }
}
