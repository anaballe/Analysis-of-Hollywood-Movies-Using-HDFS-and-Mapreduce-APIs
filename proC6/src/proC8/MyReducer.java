package proC8;
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
public class MyReducer extends Reducer<Text,Text,Text,Text>{
	@Override
	protected void reduce(Text arg0, Iterable<Text> arg1, Reducer<Text, Text, Text, Text>.Context arg2)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String s ="";
		for(Text a : arg1) {
			s = s + a.toString()+"\n";
		}
		Text oa = arg0;
		Text ob = new Text(s);
		arg2.write(oa, ob);
	}

}
