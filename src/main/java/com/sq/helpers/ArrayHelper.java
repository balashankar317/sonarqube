package com.sq.helpers;

import java.util.Arrays;

public class ArrayHelper {
	// encourage modularity, so that we can achieve highest level of reusability and
	// testability
	public int[] removeDuplicateElements(int[] inArray) {
		int[] finalArray = null;
		int[] tmpArray = null;
		int len = 0;
		int elem = 0;

		tmpArray = inArray.clone();
		len = tmpArray.length;
		for (int i = 0; i < len; i++) {
			elem = tmpArray[i];
			for (int j = i + 1; j < len; j++) {
				if (elem == tmpArray[j]) {
					// move the duplicate element of jth location to last position in the array
					for (int k = j; k < len - 1; k++) {
						int t = tmpArray[k];
						tmpArray[k] = tmpArray[k + 1];
						tmpArray[k + 1] = t;
					}
					len--;
					j = j - 1;
				}
			}
		}
		// 1 1 1 1 1 1 1
		finalArray = new int[len];
		for (int i = 0; i < len; i++) {
			finalArray[i] = tmpArray[i];
		}

		return finalArray;
	}

	public long getSumOfElements(int[] inArray) {
		return Arrays.stream(inArray).asLongStream().reduce((s, e) -> {
			return s + e;
		}).orElseThrow();
	}

}
