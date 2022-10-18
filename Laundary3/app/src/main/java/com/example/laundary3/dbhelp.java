package com.example.laundary3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class dbhelp extends SQLiteOpenHelper {
    public static final String LAUNDARY_1 = "laundary2";
    public static final String ID = "id";
    public static final String NUMB = "NUMB";
    public static final String BAN = "BANYAN";
    public static final String SHORTS = "SHORTS";
    public static final String NPANT = "NPANT";
    public static final String BEDSHEET = "BEDHSHEET";
    public static final String PILLOWSHEET = "PILLOWSHEET";
    public static final String DATE = "date";
    public static final String DUEDATE = "Duedate";

    public dbhelp(@Nullable Context context) {
        super(context, "customer.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createtablestatement = "CREATE TABLE " + LAUNDARY_1 + "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NUMB + " TEXT, "+ BAN +" TEXT, "+ SHORTS +" TEXT, "+ NPANT +" TEXT, "+ BEDSHEET +" TEXT, "+ DATE + " TEXT, "+ DUEDATE + " TEXT, " + PILLOWSHEET +" TEXT)";
        db.execSQL(createtablestatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean deleteone(datastore datastore){
        SQLiteDatabase db = getWritableDatabase();
        String queryString = "DELETE FROM " + LAUNDARY_1 + " WHERE " + ID + " = " + datastore.getId();
        Cursor cursor = db.rawQuery(queryString, null);
        if(cursor.moveToFirst()){
            return true;
        }else{
return false;
        }
    }
    public Boolean addone(datastore datastore){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NUMB,datastore.getTshirt());
        contentValues.put(BAN,datastore.getBanayan());
        contentValues.put(SHORTS,datastore.getShorts());
        contentValues.put(NPANT,datastore.getNpant());
        contentValues.put(BEDSHEET,datastore.getBedsheet());
        contentValues.put(PILLOWSHEET,datastore.getPillowsheet());
        contentValues.put(DATE,datastore.getDate());
        contentValues.put(DUEDATE,datastore.getDuedate());
        long insert= db.insert(LAUNDARY_1,null,contentValues);
        if(insert == -1){
            return false;
        }else{
            return true;
        }
    }
    public List<datastore> getEveryone(){
        List<datastore> returnlist = new ArrayList<>();
        String queryString  = "SELECT * FROM "+ LAUNDARY_1;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString,null);
        if(cursor.moveToFirst()){
            do{
               int customerid = cursor.getInt(0);
               String no = cursor.getString(1);
                String banno = cursor.getString(2);
                String shorno = cursor.getString(3);
                String npanno = cursor.getString(4);
                String bedno = cursor.getString(5);
                String pillowno = cursor.getString(8);
                String date = cursor.getString(6);
                String dueday = cursor.getString(7);
               datastore mm  = new datastore(customerid,no,shorno,npanno,bedno,pillowno,banno,date,dueday);
               returnlist.add(mm);
            }while(cursor.moveToNext());
        }else{

        }
        cursor.close();;
        db.close();
        return returnlist;
    }
}
