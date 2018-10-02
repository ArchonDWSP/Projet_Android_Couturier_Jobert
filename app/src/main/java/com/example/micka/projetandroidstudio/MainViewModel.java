package com.example.micka.projetandroidstudio;

import android.databinding.ObservableField;


public class MainViewModel  {

    public ObservableField<String> button1 = new ObservableField<>();
    public ObservableField<String> button2 = new ObservableField<>();

    Navigator main;

    public MainViewModel(Navigator main){
        this.main = main;
        button1.set(String.valueOf(R.id.Button1));
        button2.set(String.valueOf(R.id.Button2));
    }

    public void onActivity2(){
        main.goToActivity2();
    }

    public void onActivity3(){
       main.goToActivity3();
    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        switch(Item.getItemId()){
            case R.id.exit:
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainViewModel.this);
                builder.setMessage("Exit ?");
                builder.setCancelable(true);
                builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        main.finish();
                    }
                });
                builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                break;

            case R.id.settings:
                Intent intent1 = new Intent(this, MainActivity4.class);
                main.startActivity(intent1);
                break;
        }

        return main.onOptionsItemSelected(Item);
    }*/
}
