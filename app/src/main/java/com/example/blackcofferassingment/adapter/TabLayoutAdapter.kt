package com.example.blackcofferassingment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.blackcofferassingment.fragments.BussinessPageFragment
import com.example.blackcofferassingment.fragments.MarchentPageFragment
import com.example.blackcofferassingment.fragments.PersonalPageFragment

class TabLayoutAdapter(fragmentManager: FragmentManager) :FragmentStatePagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> PersonalPageFragment.newInstance(position)
            1 -> BussinessPageFragment.newInstance(position)
            2 -> MarchentPageFragment.newInstance(position)
            else -> PersonalPageFragment.newInstance(position)
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Personal"
            1 -> "Business"
            2 -> "Merchant"
            else -> "Personal"
        }
    }
}
