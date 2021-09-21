package com.vct.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestOptional {

	public int test(List<String> list) {
		Optional<List<String>> optional1 = Optional.ofNullable(list);
		return optional1.map(l->l.size()).orElse(0);
	}
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("a","b","c","d");
		Optional<List<String>> optional1 = Optional.ofNullable(list1);
		optional1.ifPresentOrElse(l->System.out.println(l.size()),()-> System.out.println("List is null") );
	}
}
