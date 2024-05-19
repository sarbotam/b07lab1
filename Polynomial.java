public class Polynomial {
	//fields
	double [] D; 
	
	//methods
	public Polynomial() {
		D = new double[1];
		D[0] = 0;  
	}
	
	public Polynomial(double [] A) {
		D = new double[A.length]; 
		for (int i = 0; i < A.length; i++) {
		    D[i] = A[i]; 
		}

	}
	
	public Polynomial add(Polynomial p) {
    		double[] B;
    		int maxLength = 0;
    		int minLength = 0;
    
    		if (D.length >= p.D.length) {
        		maxLength = D.length;
        		minLength = p.D.length;
    		} else {
        		maxLength = p.D.length;
        		minLength = D.length;
    		}

    		B = new double[maxLength];

    		for (int i = 0; i < minLength; i++) {
        		B[i] = D[i] + p.D[i];
    		}

		if (D.length >= p.D.length) {
        		for (int i = minLength; i < maxLength; i++) {
            			B[i] = D[i];
        		}
    		} else {
        		for (int i = minLength; i < maxLength; i++) {
            			B[i] = p.D[i];
        		}
    		}

    		return new Polynomial(B);
	}

	
	public double evaluate(double x) {
		double evaluation = 0;
        	for (int i = 0; i < D.length; i++) {
            	evaluation += D[i] * Math.pow(x, i);
        	}
       		return evaluation; 
	}
	
	public  boolean hasRoot(double z) {
		double evaluation = evaluate(z); 
		return evaluation == 0; 		
	}
}