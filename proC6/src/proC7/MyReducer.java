package proC7;
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
public class MyReducer extends Reducer<Text,IntWritable,Text,IntWritable>{
	@Override
	protected void reduce(Text arg0, Iterable<IntWritable> arg1,
			Reducer<Text, IntWritable, Text, IntWritable>.Context arg2) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		int i,sum =0;
		for(IntWritable j : arg1) {
			i = j.get();
			sum = sum + i;
		}
		Text oa = new Text(arg0);
		IntWritable ob = new IntWritable(sum);
		arg2.write(oa, ob);
	}

}
