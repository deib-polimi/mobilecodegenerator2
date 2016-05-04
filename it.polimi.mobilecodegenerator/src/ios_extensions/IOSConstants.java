/************************************************************************************************************************
 * Copyright 2016 Gregorio Perego, Stefania Pezzetti, Aldo Pintus
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
import app_extensions.AppJavaUtil;

public class IOSConstants {
	public static String sourceFilesFolder = "utils/ios_default_files";
	public static String[] sourceFilesPaths = {
		sourceFilesFolder+"/Contents.json",
		sourceFilesFolder+"/play_icon.png",
		sourceFilesFolder+"/pause_icon.png",
		sourceFilesFolder+"/stop_icon.png",
		sourceFilesFolder+"/list_img.png",
		sourceFilesFolder+"/list_icon.png",
		sourceFilesFolder+"/grid_image.png"
	};
	public static String destinationFilesFolder = "src-gen/ios/"+AppJavaUtil.APPLICATION_NAME;
	public static String[] destinationFilesPaths = {
		destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/Assets.xcassets/AppIcon.appiconset/Contents.json",
		destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/play_icon.png",
		destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/pause_icon.png",
		destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/stop_icon.png",
		destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/list_img.png",
		destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/list_icon.png",
		destinationFilesFolder+"/"+AppJavaUtil.APPLICATION_NAME+"/grid_image.png"
	};
}