package proC9;
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
public class MyMapper extends Mapper<LongWritable,Text,Text,IntWritable>{
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String data = value.toString();
		String [] k = data.split("[,]");
		if(k.length == 5) {
		if(!(k[4].equals(""))) {
			int i = Integer.parseInt(k[4]);
			if(i > 7200) {
			Text oa = new Text("number of movies with duration more than two hour ");
			IntWritable ob = new IntWritable(1);
			context.write(oa, ob);
			}
		}
	}
	}

}
