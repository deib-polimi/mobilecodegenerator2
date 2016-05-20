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

package android_extensions;

import app_extensions.AppJavaUtil;

public class AndroidConstants {
	
	private static String sourceFilesFolder = "utils/android_default_files";
	
	public static String[] sourceFilesPaths = {
		sourceFilesFolder+"/app/src/main/res/drawable/grid_image.png",
		sourceFilesFolder+"/app/src/main/res/drawable/card_image.png",
		sourceFilesFolder+"/app/src/main/res/drawable-hdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-mdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_chevron_right_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-hdpi/ic_pause_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-mdpi/ic_pause_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_pause_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_pause_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_pause_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-hdpi/ic_play_arrow_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-mdpi/ic_play_arrow_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_play_arrow_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_play_arrow_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_play_arrow_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-hdpi/ic_stop_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-mdpi/ic_stop_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_stop_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_stop_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_stop_white_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-hdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-mdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_stars_black_36dp.png",
		sourceFilesFolder+"/app/src/main/res/mipmap-hdpi/ic_launcher.png",
		sourceFilesFolder+"/app/src/main/res/mipmap-mdpi/ic_launcher.png",
		sourceFilesFolder+"/app/src/main/res/mipmap-xhdpi/ic_launcher.png",
		sourceFilesFolder+"/app/src/main/res/mipmap-xxhdpi/ic_launcher.png",
		sourceFilesFolder+"/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png",
		sourceFilesFolder+"/app/src/main/res/values/colors.xml",
		sourceFilesFolder+"/app/src/main/res/values/dimens.xml",
		sourceFilesFolder+"/app/src/main/res/values/strings.xml",
		sourceFilesFolder+"/app/src/main/res/values/styles.xml",
		sourceFilesFolder+"/app/src/main/res/values-v21/styles.xml",
		sourceFilesFolder+"/app/src/main/res/values-w820dp/dimens.xml",
		sourceFilesFolder+"/gradle/wrapper/gradle-wrapper.jar",
		sourceFilesFolder+"/gradle/wrapper/gradle-wrapper.properties",
		sourceFilesFolder+"/build.gradle",
		sourceFilesFolder+"/settings.gradle"
	};
	
	public static String destinationFilesFolder = "src-gen/android/"+AppJavaUtil.APPLICATION_NAME;
	
	public static String[] destinationFilesPaths = {
		destinationFilesFolder+"/app/src/main/res/drawable/grid_image.png",
		destinationFilesFolder+"/app/src/main/res/drawable/card_image.png",
		destinationFilesFolder+"/app/src/main/res/drawable-hdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-mdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_chevron_right_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-hdpi/ic_pause_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-mdpi/ic_pause_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_pause_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_pause_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_pause_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-hdpi/ic_play_arrow_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-mdpi/ic_play_arrow_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_play_arrow_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_play_arrow_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_play_arrow_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-hdpi/ic_stop_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-mdpi/ic_stop_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_stop_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_stop_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_stop_white_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-hdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-mdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xhdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxhdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/drawable-xxxhdpi/ic_stars_black_36dp.png",
		destinationFilesFolder+"/app/src/main/res/mipmap-hdpi/ic_launcher.png",
		destinationFilesFolder+"/app/src/main/res/mipmap-mdpi/ic_launcher.png",
		destinationFilesFolder+"/app/src/main/res/mipmap-xhdpi/ic_launcher.png",
		destinationFilesFolder+"/app/src/main/res/mipmap-xxhdpi/ic_launcher.png",
		destinationFilesFolder+"/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png",
		destinationFilesFolder+"/app/src/main/res/values/colors.xml",
		destinationFilesFolder+"/app/src/main/res/values/dimens.xml",
		destinationFilesFolder+"/app/src/main/res/values/strings.xml",
		destinationFilesFolder+"/app/src/main/res/values/styles.xml",
		destinationFilesFolder+"/app/src/main/res/values-v21/styles.xml",
		destinationFilesFolder+"/app/src/main/res/values-w820dp/dimens.xml",
		destinationFilesFolder+"/gradle/wrapper/gradle-wrapper.jar",
		destinationFilesFolder+"/gradle/wrapper/gradle-wrapper.properties",
		destinationFilesFolder+"/build.gradle",
		destinationFilesFolder+"/settings.gradle"
	};
	
	public static String rawFolder = destinationFilesFolder+"/app/src/main/res/raw";
	
	public static String assetsFolder = destinationFilesFolder+"/app/src/main/assets";
	
	public static String drawableFolder = destinationFilesFolder+"/app/src/main/res/drawable";
}