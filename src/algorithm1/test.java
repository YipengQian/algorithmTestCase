package algorithm1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {
      @Test
	public void testCase() {
    	  LastPositionofTarget positionofTarget = new LastPositionofTarget();
    	  int[]arr=new int[]{1,2,2,4,5,5};
	    	int lastPosition = positionofTarget.solution(arr,2);
	    	System.out.println(lastPosition+"");
	}
}
	