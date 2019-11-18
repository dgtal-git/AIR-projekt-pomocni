package com.example.pop_sajam;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("registracija.php")
    //TODO: Dodati sve potrebe paremetre ovjde koji potencijalno fale
    Call<User>performRegistration(@Query("ime") String Ime, @Query("prezime")String Prezime, @Query("korisnickoIme")String KorisnickoIme,@Query("lozinka") String Lozinka,@Query("email") String Email);

    @GET("login.php")
    Call<User>performUserLogin(@Query("korisnickoIme")String KorisnickoIme,@Query("lozinka") String Lozinka );


}
