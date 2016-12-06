package algorithm1;

public class strStr {

	/**
	 * 解决思路：首先我们有source字符串和target字符串，source字符串最后的几个字符串长度小于target肯定不会有首次出现的可能。
	 * 所以应该进行遍历操作的source字符串的长度是（source.length-target.length）的长度。
	 * 在上面那个遍历中，我们可以获取source的position获取具体字符，再将target的所有字符串进行遍历，如果第一个字符与source的相同
	 * 那么
	 * ，继续下一个target及下一个source中的字符进行对比，直到target.length次后如果完全想同则返回外层遍历那个position，
	 * 如果不同则返回上层遍历，postion+1，继续进行target的比对操作，如果全部没有则返回-1；
	 */
	public int solution(String source, String target) {
		if (source == null || target == null) {
			return -1;
		}
		for (int i = 0; i <= source.length() - target.length(); i++) {
			int j = 0;
			for (j = 0; j < target.length(); j++) {
				if (source.charAt(i + j) != target.charAt(j))
					break;
			}
			if (j == target.length()) {
				return i;
			}

		}

		return -1;
	}

}
