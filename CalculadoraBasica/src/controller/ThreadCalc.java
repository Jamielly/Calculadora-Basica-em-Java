package controller;

public class ThreadCalc extends Thread{

	private int a, b, op;
	public ThreadCalc(int a, int b, int op){
		this.a = a;
		this.b = b;
		this.op = op;
	}
    public void run() {
		// TODO Auto-generated method stub
    	Calc();
	}
    private void Calc(){
    	int res = 0;
    	String operacao = " ";
    	switch (op){
		    case 0:
    			res = a + b;
    			operacao = "+";
    			break;
    		case 1: 
    			res = a - b;
    			operacao = "-";
    			break;
    		case 2: 
    			res = a * b;
    			operacao = "*";
    			break;
    		case 3: 
    			res = a / b;
    			operacao = "/";
    			break;
    			}
    		System.out.println(getId() + " ==> " + a + " " + operacao + b + " " + " = " + res);
		}
      }