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

package android_extensions;

import app_extensions.AppJavaUtil;

public class AndroidConstants {
	private static String sourceFilesFolder = "utils/android_default_files";
	public static String[] sourceFilesPaths = {
		sourceFilesFolder+"/libs/android-support-v7-appcompat.jar",
		sourceFilesFolder+"/res/raw/grid_image.jpg",
		sourceFilesFolder+"/res/drawable-hdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/res/drawable-mdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/res/drawable-xhdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/res/drawable-xxhdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/res/drawable-xxxhdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/res/drawable-hdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/res/drawable-mdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/res/drawable-xhdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/res/drawable-xxhdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/res/drawable-xxxhdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/res/mipmap-hdpi/ic_launcher.png",
		sourceFilesFolder+"/res/mipmap-mdpi/ic_launcher.png",
		sourceFilesFolder+"/res/mipmap-xhdpi/ic_launcher.png",
		sourceFilesFolder+"/res/mipmap-xxhdpi/ic_launcher.png",
		sourceFilesFolder+"/res/mipmap-xxxhdpi/ic_launcher.png",
		sourceFilesFolder+"/res/values/colors.xml",
		sourceFilesFolder+"/res/values/dimens.xml",
		sourceFilesFolder+"/res/values/strings.xml",
		sourceFilesFolder+"/res/values/styles.xml",
		sourceFilesFolder+"/res/values-v21/styles.xml",
		sourceFilesFolder+"/res/values-w820dp/dimens.xml",
		sourceFilesFolder+"/project.properties"
	};
	public static String destinationFilesFolder = "src-gen/android/"+AppJavaUtil.APPLICATION_NAME;
	public static String[] destinationFilesPaths = {
		destinationFilesFolder+"/libs/android-support-v7-appcompat.jar",
		destinationFilesFolder+"/res/raw/grid_image.jpg",
		destinationFilesFolder+"/res/drawable-hdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/res/drawable-mdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/res/drawable-xhdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/res/drawable-xxhdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/res/drawable-xxxhdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/res/drawable-hdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/res/drawable-mdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/res/drawable-xhdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/res/drawable-xxhdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/res/drawable-xxxhdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/res/mipmap-hdpi/ic_launcher.png",
		destinationFilesFolder+"/res/mipmap-mdpi/ic_launcher.png",
		destinationFilesFolder+"/res/mipmap-xhdpi/ic_launcher.png",
		destinationFilesFolder+"/res/mipmap-xxhdpi/ic_launcher.png",
		destinationFilesFolder+"/res/mipmap-xxxhdpi/ic_launcher.png",
		destinationFilesFolder+"/res/values/colors.xml",
		destinationFilesFolder+"/res/values/dimens.xml",
		destinationFilesFolder+"/res/values/strings.xml",
		destinationFilesFolder+"/res/values/styles.xml",
		destinationFilesFolder+"/res/values-v21/styles.xml",
		destinationFilesFolder+"/res/values-w820dp/dimens.xml",
		destinationFilesFolder+"/project.properties"
	};
	public static String rawFolder = destinationFilesFolder+"/res/raw";
	public static String assetsFolder = destinationFilesFolder+"/assets";
	public static String drawableFolder = destinationFilesFolder+"/res/drawable";
}