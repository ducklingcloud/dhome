/*
 * Copyright (c) 2008-2016 Computer Network Information Center (CNIC), Chinese Academy of Sciences.
 * 
 * This file is part of Duckling project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 */
/**
 * 
 */
package net.duckling.dhome.common.util;

/**
 * @author lvly
 * @since 2013-11-25
 */
public class CharUtils {
	public static String replaceDangerouse(String value){
		if(CommonUtils.isNull(value)){
			return value;
		}
		String result=null;
		result=value.replaceAll("<","&lt;"); 
		result=result.replaceAll(">","&gt;"); 
		result=result.replaceAll("'","&#039;");
		result=result.replaceAll("\"","&quot;"); 
		return result.trim();
	}

}