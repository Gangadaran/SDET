package week2;

public class ConverToHex {
	public static void main(String[] args) {
	    int no = 47;
	    if (no >= 0) {
	      System.out.println(convertPositiveNo (no, 16));
	    } else {
	      System.out.println(convertNegativeNo(no));
	    }
	  }

	  private static String getHex(int no) {
	    switch(no) {
	      case 10: return "A";
	      case 11: return "B";
	      case 12: return "C";
	      case 13: return "D";
	      case 14: return "E";
	      case 15: return "F";
	      default: return no + "";
	    }
	  }

	  private static String convertPositiveNo (int no, int base) {
	    String output = "";
	    while (no > 0) {
	      int remainder = no % base;
	      output = getHex(remainder) + output;
	      no = no / base;
	    }
	    return output;
	  }

	  private static String convertNegativeNo (int no) {
	    no = no * -1;
	    // Step 1
	    String binary = convertPositiveNo(no, 2);
	    // Step 2
	    String twosComp = getTwosComp (binary);
	    // Step 3
	    String output = convertToHex (twosComp);
	    return output;
	  }

	  private static String getTwosComp (String binary) {
	    for (int i = binary.length(); i < 32; i++) {
	      binary = "0" + binary;
	    }

	    String onesComp = "";
	    for (int i = 0; i < binary.length(); i++) {
	      if (binary.charAt(i) == '1') {
	        onesComp += '0';
	      } else {
	        onesComp += '1';
	      }
	    }

	    String output = "";
	    boolean carry = true;
	    for (int i = onesComp.length() - 1; i >= 0; i--) {
	      if (!carry) {
	        output = onesComp.charAt(i) + output;
	      } else if (carry && onesComp.charAt(i) == '0') {
	        output = '1' + output;
	        carry = false;
	      } else {
	        output = '0' + output;
	      }
	    }
	    if(carry) {
	      output = '1'+ output;
	    }

	    return output;
	  }

	  private static String convertToHex (String twosComp) {
	    String output = "";
	    for (int i=0; i < twosComp.length(); i+=4) {
	      int sum = 0;
	      for (int j = 0, pow = 3; j <= 3; j++, pow --) {
	        if(twosComp.charAt(i+j) == '1') {
	          sum += Math.pow(2, pow);
	        }
	      }
	      output += getHex(sum);
	    }
	    return output;
	  }
}
