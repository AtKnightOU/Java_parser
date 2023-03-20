/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 1998-2018  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.*;

/**
 * Simple  driver for the java parser. 
 */
public class JavaParserHHS {
    private boolean onlyAttributeFlag;
    
    JavaParserHHS(boolean attrFlag) {
	onlyAttributeFlag = attrFlag;
    }

    public void parseHHS(String fileName) {
      try {
        System.out.println("Parsing [" + fileName + "]");
        Scanner s = new Scanner(new FileReader(fileName));
        parser p = new parser(s);
	p.setOnlyAttributeFlag(onlyAttributeFlag);
        p.parse();

        System.out.println("No errors.");
      } catch (Exception e) {
            e.printStackTrace(System.err);
            System.exit(1);
        }
    }
}

