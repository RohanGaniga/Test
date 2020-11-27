package com.info;

import java.io.InputStream;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class Ftp {

	public static void main(String[] args) {
		/*JSch jsch = new JSch();
		Session session = null;
		try {
			session = jsch.getSession("admin", "192.168.0.117", 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword("admin");
			session.connect();

			Channel channel = session.openChannel("sftp");
			channel.connect();
			ChannelSftp sftpChannel = (ChannelSftp) channel;
			Vector<ChannelSftp.LsEntry> files = sftpChannel.ls("/CSV_Split_tgtfiles");

			//Vector<ChannelSftp.LsEntry> files = sftp.ls(remotePath);

			for (ChannelSftp.LsEntry entry : files) {
				if(entry.getFilename().contains(".csv")){
					sftpChannel.rm(entry.getFilename());
				}
				System.out.println(entry.getFilename());*/
		//
		/*InputStream stream = sftpChannel.get("/New_Direc" + "/" + entry.getFilename());
			    System.out.println(stream);*/
		JSch jsch = new JSch();
		Session session = null;
		Channel channel = null;
		ChannelSftp sftpChannel = null;
		try {
			session = jsch.getSession("admin", "192.168.0.105", 22);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword("admin");
			session.connect();

			channel = session.openChannel("sftp");
			channel.connect();
			sftpChannel = (ChannelSftp) channel;
			sftpChannel.get("/RanSource/tgt_pipe_stage.csv", "//DELL-PC/Users/Dell/workspace_DellBoomi/tgt_pipe_stage.csv");


			//sftpChannel.get("/New_Direc", "C:\\Users\\Admin\\Desktop\\Box");  
			//System.out.println(sftpChannel.getExitStatus());
			sftpChannel.exit();
			session.disconnect();
		} catch (JSchException e) {
			e.printStackTrace();  
		} catch (SftpException e) {
			e.printStackTrace();
		}

	}


}
