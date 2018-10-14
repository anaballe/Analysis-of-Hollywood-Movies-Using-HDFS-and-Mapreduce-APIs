package proC11;
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
public class MyMapper extends Mapper<LongWritable,Text,Text,IntWritable> {
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Text oa = new Text("number of movies are ");
		IntWritable ob = new IntWritable(1);
		context.write(oa, ob);
		
	}

}
