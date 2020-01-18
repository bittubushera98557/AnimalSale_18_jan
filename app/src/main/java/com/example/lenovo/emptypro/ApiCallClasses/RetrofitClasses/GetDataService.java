package com.example.lenovo.emptypro.ApiCallClasses.RetrofitClasses;

import android.provider.ContactsContract;

import com.example.lenovo.emptypro.ModelClasses.AllApiResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetDataService {

     @GET("category/")
    Call<AllApiResponse.CategoryResponse> allCateListApi();

    @GET("city/")
    Call<AllApiResponse.CityResponse> allCityListApi();

    @FormUrlEncoded
    @POST("all-pets/")
    Call<AllApiResponse.AllTypePetsRes> allTypePetsListApi(@Field("cityName") String cityName,@Field("userID") String userID);

    @FormUrlEncoded
    @POST("sold/")
    Call<AllApiResponse.SoldPetsRes> getSoldPetsApi(@Field("userID") String userID);

    @FormUrlEncoded
    @POST("uploaded/")
    Call<AllApiResponse.UploadedPetsRes> getUploadedPetsApi(@Field("userID") String userID);

    @FormUrlEncoded
    @POST("favourite/")
    Call<AllApiResponse.FavouritePetsRes> getFavouritePetsApi(@Field("userID") String userID);

    @FormUrlEncoded
    @POST("filter-data/")
    Call<AllApiResponse.AllTypePetsRes> getFilterBaseApi(@Field("userID") String userID,@Field("cityName") String cityName,@Field("catId") String categoryId,@Field("subCat") String subCat);


    @FormUrlEncoded
    @POST("generateOTP/")
     Call<AllApiResponse.OtpResponse> getOtpApi(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("verifyOTP/")
    Call<AllApiResponse.VerifyOtpRes> verifyOtpApi(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("favourite-set")
    Call<AllApiResponse.CommonRes> addInFav(@Field("action") String action, @Field("userId") String userId,@Field("petId") String petId);   //action=sold,add,remove


    @FormUrlEncoded
    @POST("feedback/")
    Call<AllApiResponse.CommonRes> feedbackApi(@Field("userID") String userid, @Query("message") String message);


    @FormUrlEncoded
    @POST("profile-update/")
    Call<AllApiResponse.CommonRes> profileUpdateApi(@Query("firstName") String firstName, @Query("lastName") String lastName, @Query("address") String address,
                                                    @Query("village") String village, @Query("city") String city ,@Query("state") String state,
                                                    @Query("Email") String Email ,@Query("phone") String phone ,@Field("userID") String userid );






}
