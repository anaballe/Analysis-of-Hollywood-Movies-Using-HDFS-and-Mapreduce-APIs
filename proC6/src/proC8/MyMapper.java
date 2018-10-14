package proC8;
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
public class MyMapper extends Mapper<LongWritable,Text,Text,Text>{
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String data = value.toString();
		String [] k = data.split("[,]");
		Text oa = new Text("name of movies with rating between 3 and 4 are ");
		if(!(k[3].equals(""))) {
			double a = Double.parseDouble(k[3]);
			if(a>3.0 && a <4.0) {
				Text ob = new Text(k[1]);
				context.write(oa, ob);
			}
		}
	}

}
