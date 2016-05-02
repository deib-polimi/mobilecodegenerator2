/************************************************************************************************************************
 * Copyright 2013 Gregorio Perego, Stefania Pezzetti
 * This file is part of it.polimi.mobilecodegenerator.
 * 
 * it.polimi.mobilecodegenerator is free software: 
 * you can redistribute it and/or modify it under the terms of the 
 * GNU General Public License as published by the Free Software Foundation, 
 * either version 3 of the License, or (at your option) any later version.
 * 
 * it.polimi.mobilecodegenerator is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU General Public License for more details.You should have received a copy of the GNU General Public License
 * along with it.polimi.mobilecodegenerator. If not, see <http://www.gnu.org/licenses/>
 * ***********************************************************************************************************************/

package ios_extensions;

import java.awt.Color;
import java.io.File;
import java.util.HashMap;

import app_extensions.AppJavaUtil;

public class IOSJavaUtil {
	
	private static HashMap<String, String[]> hexadecimalIdsMap = new HashMap<String, String[]>();
	private static int count = 1000000;
	public static String getFirstHexadecimalId(String key){
		if(hexadecimalIdsMap.containsKey(key)){
			return hexadecimalIdsMap.get(key)[0];		
		}
		else{
			return generateNewHexadecimalIds(key)[0];
		}
	}
	public static String getSecondHexadecimalId(String key){
		return hexadecimalIdsMap.get(key)[1];
	}
	//36181A and 5260094950D have been chosen randomly
	private static String[] generateNewHexadecimalIds(String key) {
		String firstId 	= "36181A"+(++count)+"5260094950D";
		String secondId = "36181A"+(++count)+"5260094950D";
		String[] array = {firstId,secondId};
		hexadecimalIdsMap.put(key,array);
		return array;
	}
	
	//delete application code folder and its content (if already exists)
	public static void deleteApplicationFolder(){
		File iosAppFolder = new File(IOSConstants.destinationFilesFolder);
		AppJavaUtil.deleteFolder(iosAppFolder);
	}
	
	public static void copyUserFiles(){
		File folder = new File("utils/user_files");
		for(File source : folder.listFiles()){
			File destination = new File(IOSConstants.destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/"+source.getName());
			AppJavaUtil.copyFile(source, destination);
		}
	}
	
	public static void copyDefaultIOSFiles(){
		new File(IOSConstants.destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/Assets.xcassets").mkdirs();
		new File(IOSConstants.destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/Assets.xcassets/AppIcon.appiconset").mkdirs();
		new File(IOSConstants.destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/Base.lproj").mkdirs();
		
		for(int i=0; i<IOSConstants.sourceFilesPaths.length; i++){
			File source = new File(IOSConstants.sourceFilesPaths[i]);
			File destination = new File(IOSConstants.destinationFilesPaths[i]);
			AppJavaUtil.copyFile(source, destination);
		}
	}
	
	public static float redFromHex(String hexColor) {
		try {
			hexColor = hexColor.replace("#", "0x");
			Color c = Color.decode(hexColor);
			return (float) c.getRed()/255;
		} catch(Exception e) {
			return 0;
		}
	}
	public static float greenFromHex(String hexColor) {
		try {
			hexColor = hexColor.replace("#", "0x");
			Color c = Color.decode(hexColor);
			return (float) c.getGreen()/255;
		} catch(Exception e) {
			return 0;
		}
	}
	public static float blueFromHex(String hexColor) {
		try {
			hexColor = hexColor.replace("#", "0x");
			Color c = Color.decode(hexColor);
			return (float) c.getBlue()/255;
		} catch(Exception e) {
			return 0;
		}
	}
	
	public String domainFromUrl(String url) {
		String parts[] = url.split("//");
		String cleanUrl = parts[1];
		String results[] = cleanUrl.split("/");
		return results[0];
	}
	
	public String removeExtension(String fileName) {
		if (fileName.contains(".mp3"))		return fileName.split(".mp3")[0];
		else if (fileName.contains(".mp4")) return fileName.split(".mp4")[0];
		else return fileName;
	}
	
	/*
	private static Integer currentY;
	private static final Integer Y_OFFSET = 10;
	
	public static void resetCurrentY(){
		currentY = 20;
	}
	
	public static Integer getYOnStoryboard(Integer height){
		Integer y = currentY;
		currentY = currentY + height + Y_OFFSET;
		return y;
	}
	*/
}
