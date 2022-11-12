package firstProgram;

public class duplicate {

	public int removeDuplicate(int[]a) {
		if(a.length==0) {
			return 0;
			int i = 0;
			for(int j=1; j<a.length;j++) {
				if(a[j]!=a[i]) {
					i++;
					a[i] =a[j];
					
				}
			}
			return i+1;
		}
	}

	}


