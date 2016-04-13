package com.antox.utils;

import java.math.BigInteger;

/**
 * 
 * 进制转换
 * 
 * @author 66
 */
public class HexUtils {
	
	private static final String cStr="0123456789ABCDEF";
	private static final char[] cArr={'0','1','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	/**
	 * 字符串转换成十六进制字符串
	 * @author 66
	 * @param str
	 * @return
	 */
	public static String str2HexStr(String str) {
		StringBuilder sb = new StringBuilder("");
		byte[] bs = str.getBytes();
		int bit;
		for (int i = 0,len=bs.length; i < len; i++) {
			bit = (bs[i] & 0x0f0) >> 4;
			sb.append(cArr[bit]);
			bit = bs[i] & 0x0f;
			sb.append(cArr[bit]);
		}
		return sb.toString();
	}

	/**
	 * 十六进制转换字符串
	 * @author 66
	 * @param hexStr
	 * @return
	 */
	public static String hexStr2Str(String hexStr) {
		char[] hexs = hexStr.toCharArray();
		byte[] bytes = new byte[hexStr.length() / 2];
		int n;
		for (int i = 0,len=bytes.length; i < len; i++) {
			n = cStr.indexOf(hexs[2 * i]) * 16;
			n += cStr.indexOf(hexs[2 * i + 1]);
			bytes[i] = (byte) (n & 0xff);
		}
		return new String(bytes);
	}

	/**
	 * bytes转换成十六进制字符串
	 * @author 66
	 * @param b
	 * @return
	 */
	public static String byte2HexStr(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0,len=b.length; n <len; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1){
				hs = hs + "0" + stmp;
			}else{
				hs = hs + stmp;
				// if (n<b.length-1) hs=hs+":";
			}
		}
		return hs.toUpperCase();
	}
	
	/**
	 * 16 进制去除符号位
	 * @author 66
	 * @param b
	 * @return
	 */
	public static String bigInt2Hex(byte[] b) {
		StringBuilder sb =new StringBuilder();
		boolean start = true;
		for (int n = 0; n < b.length; n++) {
			if(b[n] == 0 && start) continue;
			sb.append(Integer.toHexString(b[n]&0xff));
			start = false;
		}
		return sb.toString();
	}
	
	/**
	 * 
	 * @author 66
	 * @param b
	 * @return
	 */
	public static String bigInt2Hex2(byte[] b){
		String stmp = "";
		StringBuilder sb=new StringBuilder();
		for (int n = 0,len=b.length; n <len; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1){
				sb.append("0"+stmp);
			}else{
				sb.append(stmp);
			}
		}
		return sb.substring(2);
	}
		
	/**
	 * 16 进制hex
	 * @author 66
	 * @param value
	 * @return
	 */
	public static String bigInt2Hex(BigInteger value) {
		byte [] b = value.toByteArray();
		return bigInt2Hex(b);
	}
			
	
	/**
	 * 
	 * @author 66
	 * @param src0
	 * @param src1
	 * @return
	 */
	private static byte uniteBytes(String src0, String src1) {
		byte b0 = Byte.decode("0x" + src0).byteValue();
		b0 = (byte) (b0 << 4);
		byte b1 = Byte.decode("0x" + src1).byteValue();
		byte ret = (byte) (b0 | b1);
		return ret;
	}

	/**
	 * bytes转换成十六进制字符串
	 * @author 66
	 * @param src
	 * @return
	 */
	public static byte[] hexStr2Bytes(String src) {
		int m = 0, n = 0;
		int l = src.length() / 2;
		byte[] ret = new byte[l];
		for (int i = 0; i < l; i++) {
			m = i * 2 + 1;
			n = m + 1;
			ret[i] = uniteBytes(src.substring(i * 2, m), src.substring(m, n));
		}
		return ret;
	}

	/**
	 * String的字符串转换成unicode的String
	 * @author 66
	 * @param strText
	 * @return
	 * @throws Exception
	 */
	public static String str2Unicode(String strText) throws Exception {
		char c;
		String strRet = "";
		int intAsc;
		String strHex;
		for (int i = 0; i < strText.length(); i++) {
			c = strText.charAt(i);
			intAsc = (int) c;
			strHex = Integer.toHexString(intAsc);
			if (intAsc > 128) {
				strRet += "//u" + strHex;
			} else {
				// 低位在前面补00
				strRet += "//u00" + strHex;
			}
		}
		return strRet;
	}

	/**
	 * unicode的String转换成String的字符串
	 * @author 66
	 * @param hex
	 * @return
	 */
	public static String unicode2Str(String hex) {
		int t = hex.length() / 6;
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String s = hex.substring(i * 6, (i + 1) * 6);
			// 高位需要补上00再转
			String s1 = s.substring(2, 4) + "00";
			// 低位直接转
			String s2 = s.substring(4);
			// 将16进制的string转为int
			int n = Integer.valueOf(s1, 16) + Integer.valueOf(s2, 16);
			// 将int转换为字符
			char[] chars = Character.toChars(n);
			str.append(new String(chars));
		}
		return str.toString();
	}
}
