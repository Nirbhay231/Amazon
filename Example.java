import java.util.*;
class Example
{
	public static void main(String[] args) {
		int [] arr ={1,2,3,4,1,2,3,6,7,8,9}; // 12346789
		Arrays.stream(arr).distinct().forEach(ele->System.out.print(ele+" "));
	}
}