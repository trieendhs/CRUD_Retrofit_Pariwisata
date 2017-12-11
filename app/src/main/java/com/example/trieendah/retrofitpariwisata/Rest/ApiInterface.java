package com.example.trieendah.retrofitpariwisata.Rest;

import com.example.trieendah.retrofitpariwisata.GetKategori;
import com.example.trieendah.retrofitpariwisata.GetPariwisata;
import com.example.trieendah.retrofitpariwisata.PostPutDelKategori;
import com.example.trieendah.retrofitpariwisata.PostPutDelPariwisata;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by Trie Endah on 11/22/2017.
 */

public interface ApiInterface {

    @GET("pariwisata/index_get")
    Call<GetPariwisata> getPariwisata();

    @GET("kategori/index_get")
    Call<GetKategori> getKategori();

    @FormUrlEncoded
    @POST("pariwisata/index")
    Call<PostPutDelPariwisata> postPariwisata(@Field("id") String id,
                                             @Field("id_kategori") String id_kategori,
                                             @Field("nama") String nama,
                                             @Field("lokasi") String lokasi,
                                             @Field("deskripsi") String deskripsi,
                                             @Field("tiket") String tiket);

    @FormUrlEncoded
    @POST("kategori/index_post")
    Call<PostPutDelKategori> postKategori(@Field("id_kategori") String id_kategori,
                                            @Field("jenis") String jenis);

    @FormUrlEncoded
    @PUT("pariwisata/index")
    Call<PostPutDelPariwisata> putPariwisata(@Field("id") String id,
                                            @Field("id_kategori") String id_kategori,
                                            @Field("nama") String nama,
                                            @Field("lokasi") String lokasi,
                                            @Field("deskripsi") String deskripsi,
                                            @Field("tiket") String tiket);

    @FormUrlEncoded
    @PUT("kategori/index_put")
    Call<PostPutDelKategori> putKategori(@Field("id_kategori") String id_kategori,
                                             @Field("jenis") String jenis);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "pariwisata/index", hasBody = true)
    Call<PostPutDelPariwisata> deletePariwisata(@Field("id") String id);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "kategori/index_delete", hasBody = true)
    Call<PostPutDelKategori> deleteKategori(@Field("id_kategori") String id_kategori);
}
