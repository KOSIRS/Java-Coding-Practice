public class PracticeOnStrings {

	public static void main(String[] args) {
		wordRev2();
	}	
	public static void specialCharacter1() {
		String input = "e#rg5$23^45!w)e&r(t";
//		Expected Respsoen 
//		Alphabetis =  ergwert
//		Numbers =  52345
//		Special Characters =  #$^!)&( 
		String alph = " ";
		String number = " ";
		String special = " ";
		for (int i=0;i<=input.length()-1;i++) {
			char ch = input.charAt(i);
			if(Character.isAlphabetic(ch) ){
				alph = alph+ch;	
			}
			else if(Character.isDigit(ch)) {
				number=number+ch;
			}
			else {
				special = special+ch;
			}
			
		}
		System.out.println("Alphabetis = "+alph);
		System.out.println("Numbers = "+number);
		System.out.println("Special Characters = "+special);
	}
	public static void reverseString() {
		String input = " Sampath Kuamr Kosireddi";
//		Expected Resposne =  idderisoK rmauK htapmaS
		String out = " ";
		for(int i=input.length()-1;i>=0;i--) {
		 out = out+input.charAt(i);
		}
		System.out.println(out);
	}
	public static void revWordd() {
		String input = "sampath Kumar Kosireddi";
//		Expected Response =   Kosireddi Kumar sampath
		String[] split = input.split(" ");
		String out = " ";
		for(int i=split.length-1;i>=0;i--) {
			 out = out+" "+split[i];
		}
		System.out.println(out);
		
	}
	public static void revWordReverse() {
		String input = ";sampath kumar kosireddi";
//		Expected Response = revWordReverse;
		String[] split = input.split(" ");
		String out = " ";
		for(int i=split.length-1;i>=0;i--) {
			out = split[i];
			for(int j=out.length()-1;j>=0;j--) {
				char ch = out.charAt(j);
				if(j==out.length()-1) {
					ch = Character.toUpperCase(ch);
				}
				System.out.print(ch);
			}
			System.out.print(" ");
		}
	}
	public static void stringRevAndUpperCase() {
		String input = " sampath kuamr kosireddi";
		//Expected Respsoen ="Idderisok Rmauk Htapmas"
		String split[] = input.split(" ");
		String out = " ";
		for (int i=split.length-1;i>=0;i--) {
			out = split[i];
			for(int j=out.length()-1;j>=0;j--) {
				char ch = out.charAt(j);
				if(j==out.length()-1) {
					 ch = Character.toUpperCase(ch);
				}
				System.out.print(ch);
				
			}
			System.out.print(" ");
		}
		
	}
	public static void wordRev2() {
		String input = "Sampath Kumar Kosiredi";
//		Expected Response = Kosiredi Kumar Sampath
		String []split = input.split(" ");
		String rev = " ";
		for(int i=split.length-1;i>=0; i--) {
		 rev = rev+split[i]+" ";
//			for(int j=rev.length()-1;j>=0;j--)
			
		}
		System.out.println(rev+" ");
	}
	public static void stringRev2() {
		String input = "sampath Kumar Kosireddi";
//		Expected Response =  idderisoK ramuK htapmas
		String out =" ";
		for(int i=input.length()-1;i>=0;i--) {
			out = out+input.charAt(i);
			
		}
//		for (int j=out.length()-1)
		System.out.println(out);
	}
	public static void Stingopp(){
		String input = "Sampath Kuamr Kosireddi";
		//Expected Response =  idderisoK rmauK htapmaS
		String out = " ";
		for (int i = input.length()-1; i>=0;i--) {
			out = out + input.charAt(i);
			}
		System.out.println(out);
	}
	public static void wordRev() {
		String input = "Sampath Kumar Kosireddi";
		//Expected Response = Kosireddi Kumar Sampath
		String [] spi = input.split(" ");
		String out = " ";
		for (int i=spi.length-1;i>=0;i--) {
//			out = spi[i]+" "+out;
			String s = spi[i];
			for (int j=0; j<=s.length()-1;j--) {
				
			}
			System.out.print(s+ " ");
		}
//		System.out.println();
		
	}
	
//String Reverse and each 1st letter of each word to the upper case
	public static void firstLetterUpper() {
		// Expected Respsonse = Idderisok Ramuk Htapmas 
		String input = "sampath kumar kosireddi";
		String spli []= input.split(" ");
		String out = " ";
		for (int i= spli.length-1; i>=0;i--) {
			String temp = spli[i];
			for(int j=temp.length()-1;j>=0;j--) {
				char ch = temp.charAt(j);
				if(j== temp.length()-1) {
					//System.out.println(temp[j].toUpperCase);
					ch = Character.toUpperCase(ch);
				}
				System.out.print(ch);
			}
			System.out.print(" ");
		}
		
	}
	public static void nagarroQuestion() {
		String input = "my name is sampath kumar";
		//Expected Response = My Name Is Sampath Kumar
		String spi[] = input.split(" ");
		String out = " ";
		for (int i=0; i<=spi.length-1;i++) {
			String s = spi[i];
			for (int j=0;j<=s.length()-1;j++) {
				char ch = s.charAt(j);
				if(j == 0) {
					ch = Character.toUpperCase(ch);
				}
				System.out.print(ch);
			}
			System.out.print(" ");
		}
				
		
	}
	public static void specialCharacteresSeparation() {
		String input = "sdfgh1234dfg@!hgty$3211%hu9^78uhb&3f5*(f67ih)";
//		Expected Response 
//				alphabetic = sdfghdfghgtyhuuhbffih
//				number = 123432119783567
//				special characters = @!$%^&*()
//				length of alphabetics = 21
//				length of numbers = 15
//				length of Special characters = 9
		String alpha ="";
		String number = "";
		String special ="";
		for (int i =0;i<=input.length()-1;i++) {
			char ch =input.charAt(i);
			if(Character.isAlphabetic(ch)) {
				alpha= alpha+ch;
//				System.out.println(alpha);
			}
			else if(Character.isDigit(ch)) {
				number = number+ch;
//				System.out.println(number);
			}
			else {
				special = special+ch;
//				System.out.println(special);
			}
			
		}
		System.out.println("alphabetic = "+ alpha);
		
		System.out.println("number = "+ number);
		System.out.println("special characters = "+ special);
		System.out.println("length of alphabetics = " + alpha.length());
		System.out.println("length of numbers = " +number.length());
		System.out.println("length of Special characters = " +special.length());
		}
	public static void StringReverseandUppercaseConversion() {
		String input = "hello sampath kumar kosireddi";
//		Expected Response = Idderisok Ramuk Htapmas Olleh 
		String [] split = input.split(" ");
		for (int i=split.length-1;i>=0;i--) {
			String ch = split[i];
			for(int j =ch.length()-1;j>=0;j--) {
				char a = ch.charAt(j);
				if(j== ch.length()-1) {
					a = Character.toUpperCase(a);
				}
				System.out.print(a);
			}
			System.out.print(" "); 
		}
		
	
		
	}
	public static void wordRev1() {
		String input = "Sampath kumar kosireddi";
//		Expected Response = Kosireddi Kumar Sampath;
		String [] split = input.split(" ");
		String out = " ";
		for (int i=split.length-1;i>=0;i--) {
			String s = split[i];
			for(int j=0; j<s.length();j++) {
				char ch = s.charAt(j);
				if(j==0) {
					 ch = Character.toUpperCase(ch);
				}
				System.out.print(ch);
			}
			
			System.out.print( " ");
		}
//		System.out.print(out+ " ");
	}
}
	