package com.food.ordering.zinger.service.interfaces;

import com.food.ordering.zinger.dao.impl.UserDaoImpl;
import com.food.ordering.zinger.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    Response<UserPlaceModel> loginRegisterCustomer(UserModel user);

    Response<UserShopListModel> verifySeller(UserModel user);

    Response<String> inviteSeller(UserShopModel userShopModel);

    Response<UserShopListModel> acceptInvite(UserShopModel userShopModel);

    /**************************************************/

    Response<List<UserModel>> getSellerByShopId(Integer shopId);

    Response<UserInviteModel> verifyInvite(Integer shopId, String mobile);

    /**************************************************/

    Response<String> updateUser(UserModel userModel);

    Response<String> updateUserPlaceData(UserPlaceModel userPlaceModel);

    Response<String> deleteSeller(Integer shopId, Integer userId);

    Response<String> deleteInvite(UserShopModel userShopModel);
}
