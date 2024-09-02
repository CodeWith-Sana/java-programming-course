public class Abc3{

public static void main(String args[]){
	for(int i=0;i<3 ;i++){
	one:{
	two:{
	three:{
  if(i==1)
    break one;
	if(i==2)
	break two;
if(i==3)
break three;

}
System.out.println("after label three");
}
System.out.println("after label two");
}
System.out.println("after label one");
}

}


}