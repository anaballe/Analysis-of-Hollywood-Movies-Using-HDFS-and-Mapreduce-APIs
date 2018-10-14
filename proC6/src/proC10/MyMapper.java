package proC10;
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
		String aa = "number of movies in the year "+k[2]+" are ";
		Text oa = new Text(aa);
		IntWritable ob = new IntWritable(1);
		context.write(oa, ob);
	}

}
