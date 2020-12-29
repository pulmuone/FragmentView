package com.example.fragmentview

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentview.databinding.FragmentSubBinding

class SubFragment : Fragment() {

    private var _binding: FragmentSubBinding?= null
    public val binding get() = _binding!!

    //View만 반환 해준다.
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        _binding = FragmentSubBinding.inflate(inflater, container, false)

        Log.d("test", "onCreateView")

//        binding.fragBtn1.setOnClickListener {
//            binding.fragText1.text = "Fragment 문자열"
//        }
        
        return binding.root
        //return super.onCreateView(inflater, container, savedInstanceState)
    }

    //Fragment가 관리하는 View 내부의 View의 주소값들이 셋팅된 후
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragBtn1.setOnClickListener {
            binding.fragText1.text = "Fragment 문자열"
        }

        binding.fragBtn2.setOnClickListener {
            //MainActivity를 추출한다.
            var parent = activity as MainActivity
            parent.binding.activityText1.text = "Activity 문자열"

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("test", "onDestroyView")
    }
}