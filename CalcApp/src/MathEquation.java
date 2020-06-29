
public class MathEquation {

	public double leftVal;
	public double rightVal;
	public char opCode; 
	public double result; 
	
	public void execute() {
		switch (opCode) {
		case 'a':
		//if(opCodes[i] == 'a')
		result = leftVal + rightVal;
		break;
	//else if(opCodes [i]== 's')
		case 's':
		result = leftVal - rightVal;
	//else if(opCodes[i] == 'd') {
		break;
		case'd': 
		result = rightVal != 0.0d ? leftVal / rightVal: 0.0d;
		
	/*	if(val2 != 0.0d)
			result = val1 / val2;
			else
				result = 0.0d; */
	
	//else if(opCodes[i] ==  'm')
		break;
		case'm': 
			
		result = leftVal * rightVal; 
	//else {
		break;
		default:
			
		System.out.println("Error");
		result = 0.0d; 
		break;
		}
	}
}