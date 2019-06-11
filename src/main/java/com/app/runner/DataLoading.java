package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoading implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Set<String> optionkeys=args.getOptionNames();
		System.out.println(optionkeys);
		List<String> list=args.getOptionValues("profile");
		System.out.println(list);
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		String[] nonOptionList=args.getSourceArgs();
		System.out.println(nonOptionList);
		System.out.println(Arrays.asList(nonOptionList));
		
	}

	
	

}
