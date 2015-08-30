package io;

import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * Created by Zalman on 22.04.2015.
 */
public class DirList {


}

class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }
}