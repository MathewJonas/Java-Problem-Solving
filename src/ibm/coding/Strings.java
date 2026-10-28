package ibm.coding;

public class Strings {

	public static void main(String[] args) {
		// Split the string

		String s1 = "mathew Jonas G";
		String[] ars1 = s1.split(" ");
		for (String letter : ars1) {
			System.out.println(letter);
		}

		String s2 = "199636";
		int in = Integer.parseInt(s2);
		System.out.println(in);
		
		
		int in2 = 2001;
		String s3=Integer.toString(in2);
		System.out.println(s3);
		
		//Java program to swap first and last characters of words in the sentence ((Important****))
		
		String s4 = "Automation is the way of Testing";    //nutomatioA si eht yaw fo gestinT
	
		String[] words = s4.split(" ");
		for(int i=0; i<words.length;i++) {
			char[] word=words[i].toCharArray();
			//System.out.println(word);
			if(word.length>1) {
				char temp = word[0];
				word[0] = word[word.length - 1];
				word[word.length - 1] = temp;
			}
			words[i]=new String(word);
			 String result = String.join(" ", words);

		        System.out.println(result);
		}
		
       //alternate approach Using substring() and string concatenation
		String s5 = "Automation is the way of Testing";
		String[] wds = s5.split(" ");
		String result = "";
		for(int i=0;i<wds.length;i++) {
		String wd =	wds[i];
		
		if(wd.length()>1) {
			wd = wd.charAt(wd.length() - 1)+wd.substring(1, wd.length() - 1)+wd.charAt(0);
		}
		result = result + wd + " ";
		}
		System.out.println(result.trim());
		}
		
		
	}


