public class pages {
    private String mText;
    private int mChoice1;
    private int mChoice2;
    private int mChoice3;
    private int mChoicesNum;

    public pages(String text){
        mText = text;
        mChoicesNum = 0;
    }
    public pages(String text1, int choice11){
        mText = text1;
        mChoice1 = choice11;
        mChoicesNum = 1;
    }
    public pages(String text2, int choice21, int choice22){
        mText = text2;
        mChoice1 = choice21;
        mChoice2 = choice22;
        mChoicesNum = 2;
    }
    public pages(String text3, int choice31, int choice32, int choice33){
        mText = text3;
        mChoice1 = choice31;
        mChoice2 = choice32;
        mChoice3 = choice33;
        mChoicesNum = 3;
    }
    public String getPageText (){
        return mText;
    }
    public int getChoice1PageNum (){
        return mChoice1;
    }
    public int getChoice2PageNum (){
        return mChoice2;
    }
    public int getChoice3PageNum (){
        return mChoice3;
    }
    public int getNumChoices (){
        return mChoicesNum;
    }
}